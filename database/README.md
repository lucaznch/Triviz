## Initialize Database

```bash
docker compose up -d postgres
dropdb triviz -h 127.0.0.1 -p 5432 -U engineer
createdb triviz -h 127.0.0.1 -p 5432 -U engineer
psql triviz -h 127.0.0.1 -p 5432 -U engineer -X < database/init/triviz-schema.sql
psql triviz -h 127.0.0.1 -p 5432 -U engineer -X < database/init/triviz-populate.sql
```