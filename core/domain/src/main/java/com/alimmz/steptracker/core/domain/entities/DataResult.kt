package com.alimmz.steptracker.core.domain.entities

sealed class DataResult<out DomainModel : BaseDomainModel> {

    data class Loading<DomainModel : BaseDomainModel>(
        val data: DomainModel? = null,
    ) : DataResult<DomainModel>()

    data class Success<out DomainModel : BaseDomainModel>(
        val data: DomainModel?,
    ) : DataResult<DomainModel>()

    data class Complete<DomainModel : BaseDomainModel>(
        val data: DomainModel? = null,
    ) : DataResult<DomainModel>()

    data class Error constructor(
        val type: DataResultErrorType,
        val retriable: Boolean = false,
        val message: String,
        val errors: List<String>? = null,
    ) : DataResult<Nothing>()

}

enum class DataResultErrorType {
    NETWORK_GENERIC_ERROR,
    NETWORK_ERROR,
    DATABASE_ERROR,
    LOCAL_NETWORK_ERROR,
    UNKNOWN_ERROR,
    UNAUTHORIZED_ERROR,
    CANCELLATION_ERROR,
    UNPROCESSABLE,
}
