package dev.sunnat629.baseAndroidFiles.models.entity

import org.joda.time.DateTime

data class GitHubEntity(
    val id: Long? = null,
    val name: String? = null,
    val company: String? = null,
    val location: String? = null,
    val bio: String? = null,
    val login: String? = null,
    val avatar_url: String? = null,
    val created_at: DateTime? = null
)