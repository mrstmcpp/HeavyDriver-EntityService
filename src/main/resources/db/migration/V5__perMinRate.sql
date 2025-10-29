
ALTER TABLE fare_rates
    ADD COLUMN per_min_rate DOUBLE PRECISION DEFAULT 0 AFTER per_km_rate;
