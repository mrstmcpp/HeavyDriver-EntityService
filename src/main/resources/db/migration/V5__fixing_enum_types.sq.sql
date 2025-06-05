ALTER TABLE car
    MODIFY car_type ENUM('XL' , 'SUV' , 'COMPACT_SUV' , 'SEDAN' , 'HATCHBACK') NOT NULL;

ALTER TABLE booking
    MODIFY booking_status ENUM('SCHEDULED',
        'ARRIVED',
        'COMPLETED',
        'ASSIGNING_DRIVER',
        'IN_RIDE',
        'CAB_ARRIVED') NOT NULL;