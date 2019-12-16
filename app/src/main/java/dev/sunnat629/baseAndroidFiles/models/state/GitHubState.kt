package dev.sunnat629.baseAndroidFiles.models.state

import dev.sunnat629.baseAndroidFiles.models.entity.GitHubEntity

sealed class GitHubState {
    object LoadingState: GitHubState()
    data class DataState(val data: List<GitHubEntity>): GitHubState()
    data class ErrorState(val errorMessage: String): GitHubState()
    object FinishState: GitHubState()
}