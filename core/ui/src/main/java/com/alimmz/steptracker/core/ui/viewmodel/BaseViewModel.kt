//package com.alimmz.steptracker.core.ui.viewmodel
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.alimmz.steptracker.core.domain.entities.BaseDomainModel
//import com.alimmz.steptracker.core.domain.entities.DataResult
//import kotlinx.coroutines.Job
//import kotlinx.coroutines.channels.Channel
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.MutableSharedFlow
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.receiveAsFlow
//import kotlinx.coroutines.launch
//import timber.log.Timber
//import kotlin.properties.Delegates
//
//abstract class BaseViewModel<M : UiModel, S : UiState<M>, A : UiAction>(initState: StickyState<M>) :
//    ViewModel() {
//
//    private val actionFlow: MutableSharedFlow<A> = MutableSharedFlow()
//    private val _uiStateFLow: MutableStateFlow<StickyState<M>> by lazy { MutableStateFlow(initState) }
//    val uiStateFlow: StateFlow<StickyState<M>> = _uiStateFLow
//    private val _singleEventChannel = Channel<LooseState<M>>()
//    val singleEventFlow = _singleEventChannel.receiveAsFlow()
//
//    var uiState by Delegates.observable(initState) { _, _, newViewState ->
//        viewModelScope.launch {
//            _uiStateFLow.emit(newViewState)
//        }
//    }
//        private set
//
//    init {
//        viewModelScope.launch {
//            actionFlow.collect { action ->
//                reduceState(action = action)
//            }
//        }
//    }
//
//    abstract fun reduceState(action: A)
//
//    fun sendAction(action: A): Job {
//        return viewModelScope.launch {
//            Timber.d("Intent : sendAction -> $action")
//            actionFlow.emit(action)
//        }
//    }
//
//    fun submitState(state: S): Job {
//        return viewModelScope.launch/*(Dispatchers.Main)*/ {
//            if (state is LooseState<*>) {
//                Timber.d("Intent : submitSingleEvent -> $state")
//                _singleEventChannel.send(state as LooseState<M>)
//            } else if (state is StickyState<*>) {
//                Timber.d("Intent : submitUiState -> $state")
//                uiState = state as StickyState<M>
//            }
//        }
//    }
//
//    fun submitUiModel(model: M?): Job {
//        return viewModelScope.launch {
//            val newState = when (uiState) {
//                is StickyState.Error<*, *> -> {
//                    StickyState.Error(
//                        uiModel = model,
//                        message = (uiState as StickyState.Error<*, *>).message,
//                        errors = (uiState as StickyState.Error<*, *>).errors,
//                        retryAction = (uiState as StickyState.Error<*, *>).retryAction,
//                        messageId = (uiState as StickyState.Error<*, *>).messageId
//                    )
//                }
//
//                is StickyState.Loading -> {
//                    StickyState.Loading(
//                        uiModel = model,
//                    )
//                }
//
//                is StickyState.Success -> {
//                    StickyState.Success(
//                        uiModel = model,
//                    )
//                }
//            }
//            uiState = newState
//        }
//    }
//
//    fun <D : BaseDomainModel, Action : UiAction> collect(
//        dataResultFlow: Flow<DataResult<D>>,
//        onLoading: (() -> S?)? = null,
//        isShowAllUnProcessableErrors: Boolean = true,
//        isShowAllErrorsInSnackbar: Boolean = true,
//        retryAction: Action? = null,
//        isMainRequest: Boolean = true,
//        onComplete: (() -> S?)? = null,
//        onResultError: ((DataResult.Error) -> S?)? = null,
//        onResultUnProcessableErrors: ((List<String>?) -> S?)? = null,
//        onSucceed: ((DataResult.Success<D>) -> Unit)? = null,
//        onSuccess: (DataResult.Success<D>) -> S?,
//    ): Job {
//        return viewModelScope.launch/*(Dispatchers.IO)*/ {
//            dataResultFlow.collect { dataResult ->
//                when (dataResult) {
//                    is DataResult.Error -> {
//                        dataResult.getUiState(isShowAllUnProcessableErrors = isShowAllUnProcessableErrors,
//                            isShowAllErrorsInSnackbar = isShowAllErrorsInSnackbar,
//                            isMainRequest = isMainRequest,
//                            onResultUnProcessableErrors = onResultUnProcessableErrors,
//                            onResultError = onResultError,
//                            retryAction = retryAction,
//                            uiModel = uiState.uiModel,
//                            submit = { resultUiState ->
//                                val newState = resultUiState as? S
//                                newState?.let {
//                                    submitState(it)
//                                }
//                            })
//                    }
//
//                    is DataResult.Loading -> {
//                        val loadingState = onLoading?.invoke() ?: run {
//                            if (isMainRequest) {
//                                StickyState.Loading(
//                                    uiModel = uiState.uiModel,
//                                ) as S
//                            } else {
//                                null
//                            }
//                        }
//                        loadingState?.let {
//                            submitState(it)
//                        }
//                    }
//
//                    is DataResult.Success -> {
//                        onSuccess(dataResult)?.let {
//                            submitState(it)
//                        }
//                        onSucceed?.invoke(dataResult)
//                    }
//
//                    is DataResult.Complete -> {
//                        onComplete?.let {
//                            onComplete()?.let { state -> submitState(state) }
//                        }
//                    }
//                }
//
//            }
//        }
//    }
//}
