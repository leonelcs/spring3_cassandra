-- Create customer table on commercial keyspace
CREATE TABLE IF NOT EXISTS commercial.customer (
    id UUID PRIMARY KEY,
    firstname TEXT,
    lastname TEXT,
    age INT,
    email TEXT,
    street TEXT,
    city TEXT,
    zip TEXT,
    country TEXT,
    number TEXT,
    createdAt timestamp,
    updatedAt timestamp
);

