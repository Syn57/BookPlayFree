package com.zachnr.bookplayfree.data.repository

import com.zachnr.bookplayfree.data.mapper.DeepSeekDataMapper
import com.zachnr.bookplayfree.data.model.DeepSeekChatResponse
import com.zachnr.bookplayfree.data.utils.handleApiResponse
import com.zachnr.bookplayfree.data.utils.safePostWrapped
import com.zachnr.bookplayfree.domain.model.DeepSeekChatDomain
import com.zachnr.bookplayfree.domain.model.DeepSeekReqBody
import com.zachnr.bookplayfree.domain.model.DomainWrapper
import com.zachnr.bookplayfree.domain.repository.DeepSeekRepository
import io.ktor.client.HttpClient
import io.ktor.client.request.setBody

internal class DeepSeekRepositoryImpl(
    private val deepSeekClient: HttpClient,
    private val mapper: DeepSeekDataMapper
): DeepSeekRepository {
    override suspend fun generateDeepSeekPrompt(
        body: DeepSeekReqBody
    ): DomainWrapper<DeepSeekChatDomain> {
        val response = deepSeekClient.safePostWrapped<DeepSeekChatResponse>("v1/chat/completions") {
            setBody(body)
        }
        return handleApiResponse(response) {
            mapper.mapChatResponseToDomain(it)
        }
    }
}
