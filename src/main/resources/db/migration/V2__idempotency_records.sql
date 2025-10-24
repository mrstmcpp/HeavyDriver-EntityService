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

ALTER TABLE idempotency_records
    ADD CONSTRAINT uc_idempotency_records_booking UNIQUE (booking_id);

ALTER TABLE idempotency_records
    ADD CONSTRAINT uc_idempotency_records_idempotencykey UNIQUE (idempotency_key);

CREATE INDEX idx_9f6f96537a1584262a10ea941 ON idempotency_records (passenger_id);

CREATE INDEX idx_e7d5288eb29c6000883f96568 ON idempotency_records (idempotency_key);

ALTER TABLE idempotency_records
    ADD CONSTRAINT FK_IDEMPOTENCY_RECORDS_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);