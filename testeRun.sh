echo "running ..."
hey -z 10s -T 'application/json' -D './book.json' -m POST http://localhost:8080/api/book/v1