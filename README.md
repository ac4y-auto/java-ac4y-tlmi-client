# java-ac4y-tlmi-client

TLMI translation service client with text-to-text request/response DTOs.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-tlmi-client`
- **Version**: `1.0.0`

## Description

Client library for the TLMI translation service providing text-to-text translation capabilities. Contains request/response DTOs with algebra layer and an HTTP service client.

### Key Classes

- `TlmiServiceClient` - HTTP client for TLMI translation service
- `Text2TextRequest` - Translation request (text, target language, source language)
- `Text2TextResponse` - Translation response
- Algebra layer: `Text2TextRequestAlgebra`, `Text2TextResponseAlgebra`

## Dependencies

- `ac4y-service-domain` (service framework)
- `com.google.code.gson:gson` (JSON)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJTlmiModule/TlmiClient`.
