ALTER TABLE driver
    ADD active_city VARCHAR(255) NULL;

ALTER TABLE driver
    ADD driver_approval_status VARCHAR(255) NULL;

ALTER TABLE driver
    ADD home_location_id BIGINT NULL;

ALTER TABLE driver
    ADD last_known_location_id BIGINT NULL;

ALTER TABLE driver
    ADD rating DOUBLE NOT NULL;

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_HOMELOCATION FOREIGN KEY (home_location_id) REFERENCES exact_location (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_LASTKNOWNLOCATION FOREIGN KEY (last_known_location_id) REFERENCES exact_location (id);

ALTER TABLE driver
    ADD CONSTRAINT check_rating CHECK ( driver.rating > 0 AND driver.rating <= 5 )