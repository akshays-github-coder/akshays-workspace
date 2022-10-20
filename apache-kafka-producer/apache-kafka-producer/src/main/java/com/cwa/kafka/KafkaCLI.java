package com.cwa.kafka;

public class KafkaCLI {
	
	/*1) Creating Kafka Topics	
		kafka-topics.bat -zookeeper localhost:2181 -topic <topic_name> --create ?partitions <value> --replication-factor <value>
	
	2) Listing the number of Topics
		kafka-topics.bat -zookeeper localhost:2181 -list
	
	3) Describing a topic
		kafka-topics.bat -zookeeper localhost:2181 -describe --topic <topic_name>
	 This command gives the whole description of a topic with the number of partitions, leader, replicas and, ISR.
	 
	4) Deleting a topic
		kafka-topics.sh -zookeeper localhost:2181 -topic<topic_name> --delete'
		
	5) Producer with Keys

A Kafka producer can write data to the topic either with or without a key. If a producer does not specify a key, the data will be stored to any of the partitions with key=null, else the data will be stored to the specified partition only. A 'parse.key' and a 'key.seperator' is required to specify a key for the topic. The command used is:

'kafka-console-producer --broker-list localhost:9092 --topic <topic_name> --property parse.key=true --property key.separator=,  
> key,value  
> another key,another value'  
Here, key is the specific partition, and value is the message to be written by the producer to the topic.

	6) Consumer to consume the messages from the topic
		kafka-console-consumer -bootstrap-server localhost:9092 -topic <topic_name>
	
	7) Reading whole messages
		'kafka-console-consumer.bat -bootstrap-server 127.0.0.1:9092 -topic myfirst -from-beginning'
	This command tells the Kafka topic to allow the consumer to read all the messages from the beginning(i.e., from the time when the consumer was inactive).

	8) 
		kafka-console-consumer -bootstrap-server localhost:9092 -topic -group <group_name>
		kafka-console-consumer.bat --bootstrap-server 127.0.0.1:9092 --topic <topic_name> --group <group_name>
		
	9)	Consumer with Keys
		'kafka-console-consumer -bootstrap-server localhost:9092 -topic <topic_name> --from-beginning -property print.key=true -property key.seperator=,'

	10) Listing Consumer Groups
			kafka-consumer-groups.bat -bootstrap-server localhost:9092 -list
			
	11) Describing a Consumer Group
			'kafka-consumer-groups.bat -bootstrap-server localhost:9092 -describe group <group_name>' */
	
	/*Resetting the Offsets
	Offsets are committed in Apache Kafka. Therefore, if a user wants to read the messages again, it is required to reset the offsets value. 'Kafka-consumer-groups' command offers an option to reset the offsets. Resetting the offset value means defining the point from where the user wants to read the messages again. It supports only one consumer group at a time, and there should be no active instances for the group.

	While resetting the offsets, the user needs to choose three arguments:

	An execution option
	Reset Specifications
	Scope
	There are two executions options available:

	'-dry-run': It is the default execution option. This option is used to plan those offsets that need to be reset.

	'
	-execute': This option is used to update the offset values.

	There are following reset specifications available:

	'-to-datetime': It reset the offsets on the basis of the offset from datetime. The format used is: 'YYYY-MM-DDTHH:mm:SS.sss'.

	'--to-earliest': It reset the offsets to the earliest offset.

	' --to-latest': It reset the offsets to the latest offset.

	'--shift-by': It reset the offsets by shifting the current offset value by 'n'. The value of 'n' can be positive or negative.

	'--from-file': It resets the offsets to the values defined in the CSV file.

	' --to-current': It reset the offsets to the current offset.

There are two scopes available to define:

'-all-topics': It reset the offset value for all the available topics within a group.

'-topics': It reset the offset value for the specified topics only. The user needs to specify the topic name for resetting the offset value.

Let's try and see:

1) Using '-to-earliest' command

kafka-cnsumer-groups --bootstrap-server 127.0.0.1:9092 --group first_app --reset-offsets --to-earliest --execute --topic myfrst

In the above command, the offsets are reset to the new offset as 0. It is because '-to-earliest' command is used, which has reset the offset value to 0.

2) Using '-shift-by' command

	kafka-cnsumer-groups --bootstrap-server 127.0.0.1:9092 --group second_app --reset-offsets --shift-by 2 --execute --topic myfrst
	
		kafka-cnsumer-groups --bootstrap-server 127.0.0.1:9092 --group second_app --reset-offsets --shift-by -1 --execute --topic myfrst
		
In the first snapshot, the offset value is shifted from '0' to '+2'. In the second one, the offset value is shifted from '2' to '-1'
*/
}
