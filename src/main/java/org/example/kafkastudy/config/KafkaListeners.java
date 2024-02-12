package org.example.kafkastudy.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaListeners {
    //private final ThreadLocal<ConsumerSeekAware.ConsumerSeekCallback> seekCallback = new ThreadLocal<>();

    @KafkaListener(topics = "${setting.topics}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, String> consumerRecord, @Header(KafkaHeaders.OFFSET) Long offset
            , Acknowledgment acknowledgment
            , Consumer<?, ?> consumer){
        try {

            log.info("Consumer Data = {}, Offset = {}, Header OffSet = {}, Partition = {}"
                    , consumerRecord.value(), consumerRecord.offset(),offset,consumerRecord.partition());
            //처리 후 커밋
            //consumer.commitAsync();
        }
        catch (Exception e){
            log.error(e.getMessage());
        }

    }
    /*public void retryOffset(@Header(KafkaHeaders.OFFSET) Long offset){
        seekCallback.get().seek("dev-topic",0,  offset-3);
    }


    public void registerSeekCallback(ConsumerSeekAware.ConsumerSeekCallback callback) {
        log.info("콜백 실행 시작");
        seekCallback.set(callback);
        log.info("콜백 실행 종료");
    }*/

}
