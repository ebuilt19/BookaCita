INSERT INTO business (business_name, email, phone, location)
VALUES
('City Barber Lounge', 'barber@city.com', '123-456-7890', 'Downtown'),
('AutoFix Mechanics', 'autofix@garage.com', '555-123-4567', 'Industrial Park'),
('Elite Cuts', 'elite@barber.com', '987-654-3210', 'Uptown');

-- Example availability slots for Business 1
INSERT INTO availability (date, start_time, end_time, business_id)
VALUES
('2025-10-27', '09:00:00', '17:00:00', 1),
('2025-10-28', '10:00:00', '18:00:00', 1);
