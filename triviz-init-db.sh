#!/bin/bash

export PGPASSWORD=password

docker compose up -d postgres

dropdb triviz -h 127.0.0.1 -p 5432 -U engineer
createdb triviz -h 127.0.0.1 -p 5432 -U engineer

psql -h 127.0.0.1 -p 5432 -U engineer -d triviz -X -f database/init/triviz-schema.sql
psql -h 127.0.0.1 -p 5432 -U engineer -d triviz -X -f database/init/triviz-populate.sql
