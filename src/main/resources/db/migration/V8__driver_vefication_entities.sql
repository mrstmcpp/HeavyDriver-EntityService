CREATE TABLE driver_document
(
    id                     BIGINT AUTO_INCREMENT NOT NULL,
    created_at             datetime              NOT NULL,
    updated_at             datetime              NOT NULL,
    document_type          VARCHAR(255)          NULL,
    verification_status    VARCHAR(255)          NULL,
    document_number        VARCHAR(255)          NULL,
    document_url           VARCHAR(255)          NULL,
    verified_by            VARCHAR(255)          NULL,
    driver_verification_id BIGINT                NOT NULL,
    CONSTRAINT pk_driverdocument PRIMARY KEY (id)
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


ALTER TABLE driver_verification
    ADD CONSTRAINT uc_driververification_driver UNIQUE (driver_id);

ALTER TABLE driver_document
    ADD CONSTRAINT FK_DRIVERDOCUMENT_ON_DRIVER_VERIFICATION FOREIGN KEY (driver_verification_id) REFERENCES driver_verification (id);

ALTER TABLE driver_verification
    ADD CONSTRAINT FK_DRIVERVERIFICATION_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);