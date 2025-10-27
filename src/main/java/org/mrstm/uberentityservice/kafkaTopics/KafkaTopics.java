package org.mrstm.uberentityservice.kafkaTopics;

public class KafkaTopics {
    public static final String BOOKING_CREATED = "booking-created";
    public static final String BOOKING_CONFIRMED = "booking-confirmed";
    public static final String BOOKING_CONFIRMED_NOTIFICATION = "booking-confirmed-notification";
    public static final String NEARBY_DRIVERS = "nearby-drivers";
    public static final String DRIVER_LOCATION = "driver-location"; //for sending to passenger through socket
    public static final String BOOKING_UPDATES = "booking-updates";

}
