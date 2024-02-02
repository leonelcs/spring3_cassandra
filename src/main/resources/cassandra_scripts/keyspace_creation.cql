-- Create a keyspace for the commercial data

create keyspace if not exists commercial with replication = { 'class' : 'SimpleStrategy', 'replication_factor' : '1' };