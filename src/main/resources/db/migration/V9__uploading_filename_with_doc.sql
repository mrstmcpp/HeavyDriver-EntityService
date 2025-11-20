ALTER TABLE driver_document
    ADD file_name VARCHAR(255) NULL;

ALTER TABLE driver_document
    DROP COLUMN document_number;