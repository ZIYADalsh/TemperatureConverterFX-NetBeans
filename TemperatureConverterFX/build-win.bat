"%~dp0mvnw" -Pwin clean javafx:jlink || mvn -Pwin clean javafx:jlink
echo Runtime image will be in target\jlink\TemperatureConverterFX
pause