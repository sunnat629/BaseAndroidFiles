package dev.sunnat629.baseAndroidFiles.di

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import java.lang.reflect.Type
import java.text.ParseException
import java.text.SimpleDateFormat


class GsonUtcDateAdapter(
    private val dateFormat: String = DEFAULT_DATE_TIME_FORMAT
) : JsonDeserializer<DateTime> {

    companion object {
        const val DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZZ"
    }

    @Synchronized
    override fun deserialize(
        jsonElement: JsonElement,
        type: Type,
        jsonDeserializationContext: JsonDeserializationContext
    ): DateTime {
        try {
            val formatter = DateTimeFormat.forPattern(dateFormat)
            return formatter.parseDateTime(jsonElement.asString)
        } catch (e: ParseException) {
            throw JsonParseException(e)
        }
    }
}