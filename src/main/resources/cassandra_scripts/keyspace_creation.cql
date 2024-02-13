-- Create a keyspace for the commercial data

create keyspace if not exists commercial with replication = { 'class' : 'SimpleStrategy', 'replication_factor' : '1' };

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