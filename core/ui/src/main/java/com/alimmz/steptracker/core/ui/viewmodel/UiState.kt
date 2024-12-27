//package com.alimmz.steptracker.core.ui.viewmodel
//
//import com.alimmz.steptracker.core.domain.entities.DataResult
//import com.alimmz.steptracker.core.navigation.NavRoutes
//
//interface UiState<out Model : UiModel> {
//    val uiModel: Model?
//}
//
//sealed class StickyState<out Model : UiModel> : UiState<Model> {
//
//    data class Loading<out Model : UiModel>(
//        override val uiModel: Model? = null,
//    ) : StickyState<Model>()
//
//    data class Success<out Model : UiModel>(
//        override val uiModel: Model?
//    ) : StickyState<Model>()
//
//    data class Error<out Model : UiModel, Action : UiAction>(
//        override val uiModel: Model?,
//        val message: String,
//        val errors: List<String>? = null,
//        val retryAction: Action? = null,
//        val messageId: String = ""
//    ) : StickyState<Model>()
//}
//
//sealed class LooseState<out Model : UiModel> : UiState<Model> {
//
//    data class Navigation (
//        val route: NavRoutes,
//        val popUpTo: NavRoutes? = null,
//        val inclusive: Boolean = false,
//        val saveState: Boolean = false,
//        val restoreState: Boolean = false,
//        val singleTop: Boolean = false,
//    ) : LooseState<Nothing>() {
//        override val uiModel: Nothing? = null
//    }
//
//    data class ResetState<out Model : UiModel>(
//        override val uiModel: Model?
//    ) : LooseState<Model>()
//
//
//    data class OpenUrl(
//        val url: String,
//    ) : LooseState<Nothing>() {
//        override val uiModel: Nothing? = null
//    }
//
//    data class PopUp(val needRefresh: Boolean = false) : LooseState<Nothing>() {
//        override val uiModel: Nothing? = null
//    }
//
//    data class ShowMessage<out Model : UiModel, Action : UiAction>(
//        val isError: Boolean = false,
//        val message: String,
//        val action: Action? = null,
//        val toastType: ToastType = ToastType.Normal,
//        val actionLabel: String? = null,
//    ) : LooseState<Model>() {
//        override val uiModel: Nothing? = null
//    }
//}
//
//fun <A : UiAction, M : UiModel, S : UiState<M>> DataResult.Error.getUiState(
//    isShowAllUnProcessableErrors: Boolean = true,
//    isShowAllErrorsInSnackbar: Boolean = true,
//    isMainRequest: Boolean = true,
//    onResultUnProcessableErrors: ((List<String>?) -> S?)? = null,
//    onResultError: ((DataResult.Error) -> S?)? = null,
//    retryAction: A? = null,
//    uiModel: UiModel? = null,
//    submit: (uiState: UiState<UiModel>) -> Unit
//
//) {
//    when (type) {
//        DataResultErrorType.UNPROCESSABLE -> {
//            if (isShowAllUnProcessableErrors && message.isNotBlank()) {
//                submit(
//                    LooseState.ShowMessage<M, A>(
//                        isError = true,
//                        message = message,
//                        errors = errors,
//                        action = retryAction,
//                        actionLabel = null,
//                    )
//                )
//            }
//            onResultUnProcessableErrors?.let {
//                onResultUnProcessableErrors(errors)?.let {
//                        state -> submit(state)
//                }
//            }
//        }
//
//        DataResultErrorType.UNAUTHORIZED_ERROR -> {
//            submit(
//                LooseState.Navigation(
//                    route = NavRoutes.HomeNav,
//                    popUpTo = NavRoutes.HomeNav,
//                    inclusive = true,
//                )
//            )
//        }
//
//        DataResultErrorType.NETWORK_ERROR,
//        DataResultErrorType.LOCAL_NETWORK_ERROR,
//        DataResultErrorType.DATABASE_ERROR,
//        DataResultErrorType.NETWORK_GENERIC_ERROR,
//        DataResultErrorType.UNKNOWN_ERROR -> {
//            if (isMainRequest) {
//                submit(
//                    StickyState.Error(
//                        uiModel = uiModel,
//                        message = message,
//                        errors = errors,
//                        retryAction = retryAction,
//                        messageId = ""
//                    )
//                )
//            } else {
//                onResultError?.let {
//                    onResultError(this)?.let { state -> submit(state) }
//                }
//            }
//            if (isShowAllErrorsInSnackbar) {
//                submit(
//                    LooseState.ShowMessage(
//                        isError = true,
//                        message = message,
//                        errors = errors,
//                        action = retryAction,
//                        actionLabel = null,
//                    )
//                )
//            }
//        }
//
//        DataResultErrorType.CANCELLATION_ERROR -> {
//            //do nothing
//        }
//    }
//}
