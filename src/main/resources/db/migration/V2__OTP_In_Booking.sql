ALTER TABLE otp
    ADD COLUMN booking_id BIGINT;

ALTER TABLE otp
    ADD CONSTRAINT uk_otp_booking UNIQUE (booking_id);

ALTER TABLE otp
    ADD CONSTRAINT fk_otp_booking
        FOREIGN KEY (booking_id) REFERENCES booking(id)
            ON DELETE CASCADE;
