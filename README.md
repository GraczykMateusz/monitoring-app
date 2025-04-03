## Kotlin + Prometheus + Grafana

#### Step 1: Build package
```
mvn package
```

#### Step 2: Build docker image
```
sudo docker build . -t monitoring-app
```

#### Step 3: Run containers
```
sudo docker compose up -d
```

#### Step 4: Enter urls:
##### Kotlin:
```
http://localhost:8080/hello
```
##### Grafana:
```
http://localhost:9090
```
##### Prometheus:
```
http://localhost:3000
```
