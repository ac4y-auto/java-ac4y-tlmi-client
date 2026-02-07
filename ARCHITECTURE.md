# Architektura - java-ac4y-tlmi-client

## Attekintes

TLMI forditas szolgaltatas kliens szoveg-szoveg keres/valasz DTO-kkal.

## Szerkezet

```
src/main/java/tlmi/service/
  algebra/
    Text2TextRequestAlgebra.java        - Forditas keres algebra (text, targetLang, sourceLang)
    Text2TextResponseAlgebra.java       - Forditas valasz algebra
  client/
    TlmiServiceClient.java             - HTTP kliens a TLMI forditas szolgaltatashoz
  domain/
    Text2TextRequest.java              - Forditas keres
    Text2TextResponse.java             - Forditas valasz
```

## Fuggosegek

- ac4y-service-domain (szolgaltatas keretrendszer)
- com.google.code.gson:gson (JSON)

## Eredet

Az `IJTlmiModule/TlmiClient` modulbol kinyerve.
