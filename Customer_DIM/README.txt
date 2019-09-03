# Steps to execute

# Full table Ingestion
# From Ingest Folder
ingest.sh FULL

# FILE Ingestion
# From Ingest Folder
ingest.sh FILE

# Data Validation in PIG
# From Validation Folder
Validate_Date.sh

# Load data to Hive
# From Hive Folder
load_hive.sh
