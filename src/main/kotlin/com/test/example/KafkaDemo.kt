package com.test.example

import io.quarkus.runtime.Startup
import io.smallrye.reactive.messaging.kafka.KafkaRecord
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.reactive.messaging.Incoming

@ApplicationScoped
@Startup
class KafkaDemo {

    @Incoming("kafka")
    suspend fun receiveMessage(record: KafkaRecord<String, ByteArray>) {
        println(record.payload)
    }
}