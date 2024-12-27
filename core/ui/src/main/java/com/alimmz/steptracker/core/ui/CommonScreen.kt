//package com.alimmz.steptracker.core.ui
//
//import android.content.Context
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.lazy.LazyListScope
//import androidx.compose.foundation.lazy.LazyListState
//import androidx.compose.foundation.lazy.rememberLazyListState
//import androidx.compose.material3.SnackbarHostState
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.navigation.NavHostController
//import com.alimmz.steptracker.core.ui.viewmodel.StickyState
//import com.alimmz.steptracker.core.ui.viewmodel.UiAction
//import com.alimmz.steptracker.core.ui.viewmodel.UiModel
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.collectLatest
//import androidx.compose.runtime.State
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.platform.LocalFocusManager
//import androidx.compose.ui.platform.LocalSoftwareKeyboardController
//import com.alimmz.steptracker.core.ui.viewmodel.LooseState
//import kotlinx.coroutines.launch
//import androidx.compose.foundation.gestures.detectTapGestures
//import androidx.compose.foundation.layout.padding
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.zIndex
//import com.alimmz.steptracker.core.ui.view.TrackerErrorView
//
//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//fun <Model : UiModel, A : UiAction> CommonScreen(
//    modifier: Modifier = Modifier,
//    navController: NavHostController,
//    uiStickyState: State<StickyState<Model>>,
//    uiLooseStateFlow: Flow<LooseState<Model>>,
//    sendAction: ((action: A) -> Unit)? = null,
//    reset: ((data: Model?) -> Unit)? = null,
//    fillMaxSize: Boolean = true,
//    otherNavController: NavHostController? = null,
//    onRefresh: (() -> Unit)? = null,
//    snackbarHostState: SnackbarHostState? = null,
//    onPopUp: ((Boolean) -> Unit)? = null,
//    topBar: @Composable ((uiModel: Model?) -> Unit),
//    content: @Composable ((uiModel: Model?, snackBarHostState: SnackbarHostState) -> Unit)? = null,
//    lazyListContent: (LazyListScope.(uiModel: Model?, snackBarHostState: SnackbarHostState) -> Unit)? = null,
//    lazyListState: LazyListState = rememberLazyListState(),
//    sheetsAndDialogs: @Composable (uiModel: Model?, snackBarHostState: SnackbarHostState) -> Unit,
//) {
//
//    val hostState = snackbarHostState ?: remember { SnackbarHostState() }
//    val snackBarHostShowErrorState = remember { mutableStateOf<Boolean?>(null) }
//    val stickyState = uiStickyState.value
//    val pullRefreshState = rememberPullRefreshState(
//        refreshing = false,
//        onRefresh = onRefresh?.let { onRefresh } ?: {},
//    )
//    Box(
//        modifier = Modifier
//            .then(
//                if (fillMaxSize) Modifier.fillMaxSize() else Modifier
//            )
//    ) {
//        val keyboard = LocalSoftwareKeyboardController.current
//        val focusManager = LocalFocusManager.current
//        val scope = rememberCoroutineScope()
//        Box(
//            modifier = Modifier
//                .then(
//                    if (fillMaxSize) Modifier.fillMaxSize() else Modifier
//                )
//                .background(Colors.bgBackground)
//                .pullRefresh(
//                    state = pullRefreshState,
//                    enabled = onRefresh?.let { true } ?: false,
//                )
//                .pointerInput(Unit) {
//                    scope.launch {
//                        detectTapGestures(onTap = {
//                            keyboard?.hide()
//                            focusManager.clearFocus()
//                        })
//                    }
//                },
//        ) {
//            val uiModel = stickyState.uiModel
//            lazyListContent?.let {
//                CommonLazyColumn(
//                    modifier = modifier,
//                    topBar = topBar,
//                    uiModel = uiModel,
//                    fillMaxSize = fillMaxSize,
//                    stickyState = stickyState,
//                    sendAction = sendAction,
//                    lazyListContent = lazyListContent,
//                    hostState = hostState,
//                    state = lazyListState,
//                )
//            } ?: run {
//                content?.let {
//                    CommonColumn(
//                        modifier = modifier,
//                        topBar = topBar,
//                        uiModel = uiModel,
//                        fillMaxSize = fillMaxSize,
//                        stickyState = stickyState,
//                        sendAction = sendAction,
//                        content = content,
//                        hostState = hostState,
//                    )
//                }
//            }
//            sheetsAndDialogs(uiModel, hostState)
//            PullRefreshIndicator(
//                refreshing = false,
//                state = pullRefreshState,
//                modifier = Modifier
//                    .align(Alignment.TopCenter)
//                    .zIndex(2f),
//                scale = true
//            )
//        }
//        val snackbarModifier = Modifier
//            .background(Color.Transparent)
//            .padding(vertical = dimens.dimen16Y, horizontal = dimens.dimen10Y)
//            .align(Alignment.TopCenter)
//        CommonSnackBarHost(snackbarModifier, hostState, snackBarHostShowErrorState)
//    }
//    HandleUiLooseState(
//        uiLooseStateFlow = uiLooseStateFlow,
//        navController = navController,
//        otherNavController = otherNavController,
//        reset = reset,
//        onPopUp = onPopUp,
//        sendAction = sendAction,
//        hostState = hostState,
//        currentContext = LocalContext.current,
//        showErrorState = snackBarHostShowErrorState,
//    )
//}
//
//@Composable
//private fun <A : UiAction, Model : UiModel> CommonColumn(
//    modifier: Modifier = Modifier,
//    topBar: @Composable (uiModel: Model?) -> Unit,
//    uiModel: Model?,
//    fillMaxSize: Boolean,
//    stickyState: StickyState<Model>,
//    sendAction: ((action: A) -> Unit)?,
//    content: @Composable (uiModel: Model?, snackBarHostState: SnackbarHostState) -> Unit,
//    hostState: SnackbarHostState,
//) {
//    Column(
//        modifier = modifier
//            .then(
//                if (fillMaxSize) Modifier.fillMaxSize() else Modifier
//            )
//            .background(Colors.bgBackground)
//    ) {
//        topBar(uiModel)
//        when (stickyState) {
//            is StickyState.Error<*, *> -> {
//                MainNetworkError(
//                    modifier = Modifier.fillMaxSize(),
//                    stickyState = stickyState,
//                    retryAction = sendAction
//                )
//            }
//
//            is StickyState.Loading -> {
//                LoadingBox(
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
//
//            is StickyState.Success -> {
//                content(uiModel, hostState)
//            }
//        }
//    }
//}
//
//@Composable
//@OptIn(ExperimentalFoundationApi::class)
//private fun <A : UiAction, Model : UiModel> CommonLazyColumn(
//    modifier: Modifier = Modifier,
//    topBar: @Composable (uiModel: Model?) -> Unit,
//    uiModel: Model?,
//    fillMaxSize: Boolean,
//    stickyState: StickyState<Model>,
//    sendAction: ((action: A) -> Unit)?,
//    lazyListContent: LazyListScope.(uiModel: Model?, snackBarHostState: SnackbarHostState) -> Unit,
//    hostState: SnackbarHostState,
//    state: LazyListState = rememberLazyListState()
//) {
//    LazyColumn(
//        modifier = modifier
//            .then(
//                if (fillMaxSize) Modifier.fillMaxSize() else Modifier
//            )
//            .background(Colors.bgBackground),
//        state = state,
//    ) {
//        stickyHeader {
//            topBar(uiModel)
//        }
//        when (stickyState) {
//            is StickyState.Error<*, *> -> {
//                item {
//                    MainNetworkError(
//                        modifier = Modifier.fillParentMaxSize(),
//                        stickyState = stickyState,
//                        retryAction = sendAction
//                    )
//                }
//            }
//
//            is StickyState.Loading -> {
//                item {
//                    LoadingBox(
//                        modifier = Modifier.fillParentMaxSize()
//                    )
//                }
//
//            }
//
//            is StickyState.Success -> {
//                lazyListContent(uiModel, hostState)
//            }
//        }
//    }
//}
//
//@Composable
//fun CommonSnackBarHost(
//    modifier: Modifier,
//    hostState: SnackbarHostState,
//    showErrorState: State<Boolean?>,
//) {
//    SnackbarHost(
//        modifier = modifier,
//        hostState = hostState,
//    ) {
//        STSnackbar(
//            snackbarData = SnackbarData(
//                toastType = when (showErrorState.value) {
//                    true -> {
//                        ToastType.Error()
//                    }
//
//                    false -> {
//                        ToastType.Success()
//                    }
//
//                    else -> {
//                        ToastType.Normal
//                    }
//                },
//            ),
//            message = it.visuals.message
//        )
//    }
//}
//
//@Composable
//fun <A : UiAction, Model : UiModel> HandleUiLooseState(
//    uiLooseStateFlow: Flow<LooseState<Model>>,
//    navController: NavHostController,
//    otherNavController: NavHostController?,
//    reset: ((data: Model?) -> Unit)?,
//    onPopUp: ((Boolean) -> Unit)?,
//    sendAction: ((retryAction: A) -> Unit)?,
//    hostState: SnackbarHostState,
//    currentContext: Context,
//    showErrorState: MutableState<Boolean?>,
//) {
//    LaunchedEffect(Unit) {
//        uiLooseStateFlow.collectLatest {
//            Timber.d("Intent : collectUiState loose -> $it")
//            when (it) {
//                is LooseState.Navigation -> {
//                    navController.enableOnBackPressed(true)
//                    val controller =
//                        otherNavController?.graph?.findNode(it.route)?.let { otherNavController }
//                            ?: navController
//                    controller.navigate(it.route) {
//                        it.popUpTo?.let { popUpToRoute ->
//                            popUpTo(popUpToRoute) {
//                                inclusive = it.inclusive
//                                saveState = it.saveState
//                            }
//                        }
//                        launchSingleTop = it.singleTop
//                        restoreState = it.restoreState
//                    }
//                }
//
//                is LooseState.ResetState<*> -> {
//                    reset?.invoke(it.uiModel)
//                }
//
//                is LooseState.OpenUrl -> {
//                    currentContext.openUrlInBrowser(it.url)
//                }
//
//                is LooseState.PopUp -> {
//                    onPopUp?.invoke(it.needRefresh) ?: run {
//                        val popBackStack = otherNavController?.popBackStack() ?: false
//                        if (!popBackStack) {
//                            navController.popBackStack()
//                        }
//                    }
//                }
//
//                is LooseState.ShowMessage<*, *> -> {
//                    val action = { it.action?.let { action -> sendAction?.invoke(action as A) } }
//                    showErrorState.value = it.isError
//                    hostState.showSnackBarMessage(
//                        snackBarMessage = it.message.toIntOrNull()?.let { stringResId ->
//                            currentContext.resources.getString(stringResId)
//                        } ?: it.message,
//                        actionLabel = it.actionLabel,
//                        actionPerformed = action,
//                        actionDismissed = {})
//                }
//            }
//        }
//    }
//}
//
//suspend fun SnackbarHostState.showSnackBarMessage(
//    snackBarMessage: String,
//    actionLabel: String?,
//    actionPerformed: () -> Unit?,
//    actionDismissed: () -> Unit,
//) {
//    val snackbarResult = showSnackbar(
//        message = snackBarMessage,
//        actionLabel = actionLabel,
//    )
//    when (snackbarResult) {
//        SnackbarResult.ActionPerformed -> {
//            actionPerformed()
//        }
//
//        SnackbarResult.Dismissed -> {
//            actionDismissed()
//        }
//    }
//}
//
//@Composable
//fun LoadingBox(
//    modifier: Modifier = Modifier
//) {
//    Box(
//        modifier = modifier
//            .background(Colors.bgBackground)
//            .clickable(enabled = false) {},
//        contentAlignment = Alignment.Center,
//    ) {
//        STLoading()
//    }
//}
//
//@Composable
//fun <A : UiAction> MainNetworkError(
//    modifier: Modifier,
//    stickyState: StickyState.Error<*, *>,
//    retryAction: ((retryAction: A) -> Unit)?
//) {
//    Box(
//        modifier = modifier
//            .background(Colors.bgBackground)
//            .fillMaxSize()
//    ) {
//        TrackerErrorView(
////            modifier = Modifier.align(Alignment.Center),
////            errorType = NetworkError.NoInternetConnection,
////            retryAction = {
////                stickyState.retryAction?.let { action ->
////                    retryAction?.invoke(
////                        action as A
////                    )
////                }
////            }
//        )
//    }
//}
