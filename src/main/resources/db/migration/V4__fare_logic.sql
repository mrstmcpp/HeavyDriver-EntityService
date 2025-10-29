CREATE TABLE fare
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updated_at datetime              NOT NULL,
    booking_id BIGINT                NOT NULL,
    car_type   SMALLINT              NULL,
    distance   DOUBLE                NOT NULL,
    duration   DOUBLE                NOT NULL,
    surge      DOUBLE                NOT NULL,
    discount   DOUBLE                NOT NULL,
    final_fare DOUBLE                NOT NULL,
    CONSTRAINT pk_fare PRIMARY KEY (id)
);

CREATE TABLE fare_rates
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    created_at  datetime              NOT NULL,
    updated_at  datetime              NOT NULL,
    car_type    SMALLINT              NULL,
    base_fare   DOUBLE                NOT NULL,
    per_km_rate DOUBLE                NOT NULL,
    min_fare    DOUBLE                NOT NULL,
    active      BIT(1)                NOT NULL,
    CONSTRAINT pk_fare_rates PRIMARY KEY (id)
);


ALTER TABLE fare
    ADD CONSTRAINT uc_fare_booking UNIQUE (booking_id);

ALTER TABLE fare
    ADD CONSTRAINT FK_FARE_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);
