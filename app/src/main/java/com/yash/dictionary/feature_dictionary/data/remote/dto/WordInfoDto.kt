package com.yash.dictionary.feature_dictionary.data.remote.dto

import com.yash.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meaning: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfo {
        return WordInfo(
            meanings = meaning.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}
