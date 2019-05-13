#!/usr/bin/env bash

# threads 2
# keep 100 connections open
# run for 30 seconds
# throughput of 2000 req/sec

wrk2 -t2 -c100 -d30s -R2000 http://hello-quarkus-quarkus.192.168.99.100.nip.io/hello