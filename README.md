# Package
* slf4j-test = Maven multi module project
* customlogger-lib = Custom logger library made with slf4j
* cool-service = A cool service which uses the customlogger

# Branches & test
* master (log4j)
    * Config: `customlogger-lib/src/main/resource/log4j2.xml`
    * Run: `cool-service/src/main/java/org/example/Main`
* logback
    * Config: `customlogger-lib/src/main/resource/logback.xml`
    * Run: `cool-service/src/main/java/org/example/Main`