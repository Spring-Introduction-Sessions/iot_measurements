#!/bin/bash
docker run --name iotpostgres -e POSTGRES_PASSWORD=test123 -p 30000:5432 -d postgres