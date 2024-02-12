# Springboot + Apache Kafka Test Example

## 1. Producer
The producer component of the program sends messages to a Kafka topic. Messages can be of any format (string, JSON, Avro, etc.) and are typically grouped by topic partitions. Producers are responsible for publishing data to Kafka topics, which can then be consumed by consumers.
## 2.Consumer
The consumer component of the program retrieves messages from a Kafka topic. Consumers subscribe to one or more topics and read messages from the partitions of those topics. They can be part of a consumer group, allowing multiple consumers to work together to process messages in parallel.
## 3.Listener
A Kafka listener is a component in Apache Kafka that allows consumers to subscribe to and receive messages from Kafka topics. It serves as a communication interface between the Kafka brokers and the consumer application.

### The source code is processed under the assumption that the Kafka server is installed.

<hr>
Springboot로 Kafka 샘플 프로그램
<hr>
