package dev.sunnat629.baseAndroidFiles.models.repository

import dev.sunnat629.baseAndroidFiles.models.api.GitHubApi
import javax.inject.Inject

class GitHubRepository @Inject constructor(
    private val gitHubApi: GitHubApi
){

}