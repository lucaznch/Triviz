## Initialize Database

### Manual Setup

Start the PostgreSQL container:
```bash
docker compose up -d postgres
```

Drop the existing database (if it exists):
```bash
dropdb triviz -h 127.0.0.1 -p 5432 -U engineer
```

Create a fresh database:
```bash
createdb triviz -h 127.0.0.1 -p 5432 -U engineer
```

Create the schema and populate with sample data:
```bash
psql triviz -h 127.0.0.1 -p 5432 -U engineer -X < database/init/triviz-schema.sql
psql triviz -h 127.0.0.1 -p 5432 -U engineer -X < database/init/triviz-populate.sql
```

----

### Script

Make the initialization script executable:
```bash
chmod +x triviz-init-db.sh
```

Run the script:
```bash
./triviz-init-db.sh
```


