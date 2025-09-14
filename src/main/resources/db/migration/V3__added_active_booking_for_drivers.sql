ALTER TABLE driver
    ADD active_booking BIGINT NULL;

ALTER TABLE driver
    DROP COLUMN is_available;
