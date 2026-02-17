pipeline {
agent any
stages {
stage('Build Order Service') {
steps {
bat 'cd order-service && mvn clean package -DskipTests'
}
}
stage('Docker Build') {
steps {
bat 'cd order-service && docker build -t order-service .'
}
}
}
}