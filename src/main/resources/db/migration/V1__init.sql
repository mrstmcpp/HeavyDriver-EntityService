CREATE TABLE booking
(
    id                BIGINT AUTO_INCREMENT NOT NULL,
    created_at        datetime              NOT NULL,
    updated_at        datetime              NOT NULL,
    booking_status    VARCHAR(255)          NULL,
    start_time        datetime              NULL,
    end_time          datetime              NULL,
    total_distance    BIGINT                NULL,
    driver_id         BIGINT                NULL,
    passenger_id      BIGINT                NULL,
    start_location_id BIGINT                NULL,
    end_location_id   BIGINT                NULL,
    otp_id            BIGINT                NULL,
    car_type          VARCHAR(255)          NULL,
    CONSTRAINT pk_booking PRIMARY KEY (id)
);

CREATE TABLE booking_review
(
    id         BIGINT NOT NULL,
    booking_id BIGINT NOT NULL,
    CONSTRAINT pk_booking_review PRIMARY KEY (id)
);

CREATE TABLE car
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    created_at   datetime              NOT NULL,
    updated_at   datetime              NOT NULL,
    brand        VARCHAR(255)          NULL,
    model        VARCHAR(255)          NULL,
    plate_number VARCHAR(255)          NOT NULL,
    driver_id    BIGINT                NULL,
    car_type     VARCHAR(255)          NULL,
    CONSTRAINT pk_car PRIMARY KEY (id)
);

CREATE TABLE driver
(
    id                     BIGINT AUTO_INCREMENT NOT NULL,
    created_at             datetime              NOT NULL,
    updated_at             datetime              NOT NULL,
    full_name              VARCHAR(255)          NOT NULL,
    email                  VARCHAR(255)          NOT NULL,
    password               VARCHAR(255)          NOT NULL,
    phone_number           VARCHAR(255)          NOT NULL,
    license_number         VARCHAR(255)          NULL,
    aadhar_card_number     VARCHAR(255)          NOT NULL,
    driver_approval_status VARCHAR(255)          NULL,
    last_known_location_id BIGINT                NULL,
    home_location_id       BIGINT                NULL,
    active_city            VARCHAR(255)          NULL,
    rating                 DOUBLE                NOT NULL,
    active_booking_id      BIGINT                NULL,
    CONSTRAINT pk_driver PRIMARY KEY (id)
);

CREATE TABLE driver_document
(
    id                     BIGINT AUTO_INCREMENT NOT NULL,
    created_at             datetime              NOT NULL,
    updated_at             datetime              NOT NULL,
    document_type          VARCHAR(255)          NULL,
    verification_status    VARCHAR(255)          NULL,
    file_name              VARCHAR(255)          NULL,
    document_url           VARCHAR(255)          NULL,
    verified_by            VARCHAR(255)          NULL,
    driver_verification_id BIGINT                NOT NULL,
    CONSTRAINT pk_driverdocument PRIMARY KEY (id)
);

CREATE TABLE driver_review
(
    driver_review_id BIGINT NOT NULL,
    booking_id       BIGINT NOT NULL,
    CONSTRAINT pk_driver_review PRIMARY KEY (driver_review_id)
);

CREATE TABLE driver_verification
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    created_at  datetime              NOT NULL,
    updated_at  datetime              NOT NULL,
    driver_id   BIGINT                NOT NULL,
    verified_at datetime              NULL,
    remarks     VARCHAR(255)          NULL,
    CONSTRAINT pk_driververification PRIMARY KEY (id)
);

CREATE TABLE exact_location
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updated_at datetime              NOT NULL,
    latitude   DOUBLE                NULL,
    longitude  DOUBLE                NULL,
    address    VARCHAR(255)          NULL,
    CONSTRAINT pk_exactlocation PRIMARY KEY (id)
);

CREATE TABLE fare
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updated_at datetime              NOT NULL,
    booking_id BIGINT                NOT NULL,
    car_type   VARCHAR(255)          NULL,
    distance   DOUBLE                NOT NULL,
    duration   DOUBLE                NOT NULL,
    surge      DOUBLE                NOT NULL,
    discount   DOUBLE                NOT NULL,
    final_fare DOUBLE                NOT NULL,
    CONSTRAINT pk_fare PRIMARY KEY (id)
);

CREATE TABLE fare_rates
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    created_at   datetime              NOT NULL,
    updated_at   datetime              NOT NULL,
    car_type     VARCHAR(255)          NULL,
    base_fare    DOUBLE                NOT NULL,
    per_km_rate  DOUBLE                NOT NULL,
    per_min_rate DOUBLE                NOT NULL,
    min_fare     DOUBLE                NOT NULL,
    active       BIT(1)                NOT NULL,
    CONSTRAINT pk_fare_rates PRIMARY KEY (id)
);

CREATE TABLE idempotency_records
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    created_at      datetime              NOT NULL,
    updated_at      datetime              NOT NULL,
    passenger_id    BIGINT                NULL,
    idempotency_key VARCHAR(255)          NOT NULL,
    request_hash    LONGTEXT              NULL,
    response_data   LONGTEXT              NULL,
    booking_id      BIGINT                NULL,
    CONSTRAINT pk_idempotency_records PRIMARY KEY (id)
);

CREATE TABLE named_location
(
    id                BIGINT AUTO_INCREMENT NOT NULL,
    created_at        datetime              NOT NULL,
    updated_at        datetime              NOT NULL,
    exact_location_id BIGINT                NULL,
    name              VARCHAR(255)          NULL,
    zip_code          VARCHAR(255)          NULL,
    city              VARCHAR(255)          NULL,
    state             VARCHAR(255)          NULL,
    country           VARCHAR(255)          NULL,
    CONSTRAINT pk_namedlocation PRIMARY KEY (id)
);

CREATE TABLE otp
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updated_at datetime              NOT NULL,
    code       VARCHAR(255)          NULL,
    CONSTRAINT pk_otp PRIMARY KEY (id)
);

CREATE TABLE passenger
(
    id                     BIGINT AUTO_INCREMENT NOT NULL,
    created_at             datetime              NOT NULL,
    updated_at             datetime              NOT NULL,
    passanger_name         VARCHAR(255)          NOT NULL,
    phone_number           VARCHAR(255)          NOT NULL,
    email                  VARCHAR(255)          NOT NULL,
    password               VARCHAR(255)          NOT NULL,
    active_booking_id      BIGINT                NULL,
    last_known_location_id BIGINT                NULL,
    home_location_id       BIGINT                NULL,
    CONSTRAINT pk_passenger PRIMARY KEY (id)
);

CREATE TABLE passenger_review
(
    passenger_review_id BIGINT NOT NULL,
    booking_id          BIGINT NOT NULL,
    CONSTRAINT pk_passenger_review PRIMARY KEY (passenger_review_id)
);

CREATE TABLE review
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updated_at datetime              NOT NULL,
    content    VARCHAR(255)          NOT NULL,
    rating     DOUBLE                NULL,
    driver_id  BIGINT                NOT NULL,
    CONSTRAINT pk_review PRIMARY KEY (id)
);

ALTER TABLE booking
    ADD CONSTRAINT uc_booking_otp UNIQUE (otp_id);

ALTER TABLE booking_review
    ADD CONSTRAINT uc_booking_review_booking UNIQUE (booking_id);

ALTER TABLE car
    ADD CONSTRAINT uc_car_platenumber UNIQUE (plate_number);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_aadharcardnumber UNIQUE (aadhar_card_number);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_active_booking UNIQUE (active_booking_id);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_email UNIQUE (email);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_fullname UNIQUE (full_name);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_licensenumber UNIQUE (license_number);

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_phonenumber UNIQUE (phone_number);

ALTER TABLE driver_review
    ADD CONSTRAINT uc_driver_review_booking UNIQUE (booking_id);

ALTER TABLE driver_verification
    ADD CONSTRAINT uc_driververification_driver UNIQUE (driver_id);

ALTER TABLE fare
    ADD CONSTRAINT uc_fare_booking UNIQUE (booking_id);

ALTER TABLE idempotency_records
    ADD CONSTRAINT uc_idempotency_records_booking UNIQUE (booking_id);

ALTER TABLE idempotency_records
    ADD CONSTRAINT uc_idempotency_records_idempotencykey UNIQUE (idempotency_key);

ALTER TABLE passenger
    ADD CONSTRAINT uc_passenger_active_booking UNIQUE (active_booking_id);

ALTER TABLE passenger
    ADD CONSTRAINT uc_passenger_email UNIQUE (email);

ALTER TABLE passenger
    ADD CONSTRAINT uc_passenger_phonenumber UNIQUE (phone_number);

ALTER TABLE passenger_review
    ADD CONSTRAINT uc_passenger_review_booking UNIQUE (booking_id);

ALTER TABLE review
    ADD CONSTRAINT uc_review_driver UNIQUE (driver_id);

CREATE INDEX idx_9f6f96537a1584262a10ea941 ON idempotency_records (passenger_id);

CREATE INDEX idx_e7d5288eb29c6000883f96568 ON idempotency_records (idempotency_key);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_ENDLOCATION FOREIGN KEY (end_location_id) REFERENCES exact_location (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_OTP FOREIGN KEY (otp_id) REFERENCES otp (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_PASSENGER FOREIGN KEY (passenger_id) REFERENCES passenger (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_STARTLOCATION FOREIGN KEY (start_location_id) REFERENCES exact_location (id);

ALTER TABLE booking_review
    ADD CONSTRAINT FK_BOOKING_REVIEW_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE booking_review
    ADD CONSTRAINT FK_BOOKING_REVIEW_ON_ID FOREIGN KEY (id) REFERENCES review (id);

ALTER TABLE car
    ADD CONSTRAINT FK_CAR_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE driver_document
    ADD CONSTRAINT FK_DRIVERDOCUMENT_ON_DRIVER_VERIFICATION FOREIGN KEY (driver_verification_id) REFERENCES driver_verification (id);

ALTER TABLE driver_verification
    ADD CONSTRAINT FK_DRIVERVERIFICATION_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_ACTIVE_BOOKING FOREIGN KEY (active_booking_id) REFERENCES booking (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_HOMELOCATION FOREIGN KEY (home_location_id) REFERENCES exact_location (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_LASTKNOWNLOCATION FOREIGN KEY (last_known_location_id) REFERENCES exact_location (id);

ALTER TABLE driver_review
    ADD CONSTRAINT FK_DRIVER_REVIEW_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE driver_review
    ADD CONSTRAINT FK_DRIVER_REVIEW_ON_DRIVER_REVIEW FOREIGN KEY (driver_review_id) REFERENCES review (id);

ALTER TABLE fare
    ADD CONSTRAINT FK_FARE_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE idempotency_records
    ADD CONSTRAINT FK_IDEMPOTENCY_RECORDS_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE named_location
    ADD CONSTRAINT FK_NAMEDLOCATION_ON_EXACTLOCATION FOREIGN KEY (exact_location_id) REFERENCES exact_location (id);

ALTER TABLE passenger
    ADD CONSTRAINT FK_PASSENGER_ON_ACTIVE_BOOKING FOREIGN KEY (active_booking_id) REFERENCES booking (id);

ALTER TABLE passenger
    ADD CONSTRAINT FK_PASSENGER_ON_HOMELOCATION FOREIGN KEY (home_location_id) REFERENCES exact_location (id);

ALTER TABLE passenger
    ADD CONSTRAINT FK_PASSENGER_ON_LASTKNOWNLOCATION FOREIGN KEY (last_known_location_id) REFERENCES exact_location (id);

ALTER TABLE passenger_review
    ADD CONSTRAINT FK_PASSENGER_REVIEW_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE passenger_review
    ADD CONSTRAINT FK_PASSENGER_REVIEW_ON_PASSENGER_REVIEW FOREIGN KEY (passenger_review_id) REFERENCES review (id);

ALTER TABLE review
    ADD CONSTRAINT FK_REVIEW_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);