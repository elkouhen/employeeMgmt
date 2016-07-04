CREATE SEQUENCE employee_id_seq;

CREATE TABLE employee (
  id INT PRIMARY KEY NOT NULL DEFAULT nextval('employee_id_seq'),
  lastname VARCHAR(32),
  firstname VARCHAR(32)
);

ALTER SEQUENCE employee_id_seq OWNED BY employee.id;