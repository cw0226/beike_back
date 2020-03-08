package com.kgc.utils;

/**
 * 支付宝支付配置
 */
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101800716978";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCQUswdPdZ7ZGWRHuqISDjHLUi4mh3PL1qYhY01GcQPZgYPj9/ytdrPOSYBP7MFFCzxWFrJmbbeIbbWKUbf8P/dumuRO2KYuIu7vDBrX6XHV6MDvJYr4NURQ8fiN/bg4cqiEWO2IFZ/PQr8DURxEn5OuPYm5xyOeptjOeIObZnYBDxt+U1X4H8TAHhQLCpwgYshxTghTusre3OTC0qNDuxFNPy8x0pM1dzPLMULuLiCg0SnSJnelnKaNvvJnoPB1jvMEU34fssPPDdbcgj8hEi+QDTZmxCrHW8tCDTSy6idiOp7zroNlcMxYDU9c/nZIjDWpe5s/pckZp5UJNTL1Fo9AgMBAAECggEAZYz89q5mVtij5uMcH9zBptSkUNCQnRIy6xM98tk4baVaKmUQLVXsqtcJeON7cd1qaj/DUguI8vBCGJtetYB8aWYc/koM7G0eVXDrmQHqQkPV/nEaMbG3+rf406KRYlc+H5+gy6whcNJhAk3LlMxwd7AJ9AG2xEJdSAqYl5JjJ+10IA+sJtrQnEK1MlXqXCrwpDYbLnES4K2DGiHqoODjq3eNvezbxtmN8IMffvXpRxysZC7SzkgDps+Q0WsnkCEUNQXkxbMTV+UZdUnAfN1d4aOJXtLHN0CeyfY4L2MUEJv/9hat1KdN3b6SrHayBFYesNFAlV2FGyZEpN+SfKy7eQKBgQDMOW5ARHbeR8r2ctNWwOIlWRPVnB8YLvv7e4Vx/wcYPM0kT7wQbxlR19YlExz/5rXepoxVia5217vF+M5Efj+3dMZvQrcn+Ey+PnBXeYMcep6PzSLYAIiMizrgUungESFldBxJ/8uSzumZObK6XItmRunjxB8PDeCNFlyuW3EinwKBgQC06a1kJzFRKzVpDg93TyzsCLgjh8W6e8ptF0MGOlE3Kze1IfZruyHlodniMD+QybDjj5+MndvhslHdcSxOnLrPfv71336NRy+vU6MqFgTmO4S3TMbipAgiIzN0M1ewNmxKbamlB5O0P4f2AlkqpAl03Sqm+Wbt169FfD7jaMlRowKBgB8RdZZNVBAIt/W6DjCac0zfOkc60vgo3aiqZ+iptXiYd1TY1HFjlWSAA1HskHLVtEFE8QBqS6JEu4ooiaid1C+ikjWG3roz6ejfMtP75lhExy51NKHLovpOjAxoULAHqx72BP+07FFPLPZkcq4rOgG7NAW0Zk0x/UE5b6wOuS1dAoGASA/gokk+Sr+0WbFhFbwy/54Fgxmc+EhA/K1MZFmsahZL7Vmm54i12ttah8+CMnE0haB7BC8JG+DE3TksVe/2NZq3gkbRCQN3ChZ9otD8iJzio4Twn+yI1NhCsaGV5zn2brs53OOkwSKhTKvoyqRmo+dJCxPDHTBRv5LbFghyUJMCgYB8ZnUdUXoTmH7E1IWrqigm7+m3nX1VGXW6OOp2BBHkg2QzUgs1ZQYILlBfSHoOuhec+3V2Z74nW0QY6DvsyCuqxjeuZZJEkup9nMy3KRpB4NdycgV6bURvSifioGEeGYe3XlGDM5SsujXkN5f9uFiSKBeS6+PVWXE1RNjXnJD+HQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqE8/5u4zKHJubgJpl6TG2AYX7oUL3en+uscCH2aByCcqU2HUVJc+QYdzh309w0U2+sF5XGIx7hrKIoFBi8HIn/CJtyUqnvwf/n71PRDh6d+ra6O81fpauJ4C4Or5T/tviU1i32E/pHBzYRJp17Lnj70nZx4CMhO2X6X9NaFYRv7EuETlIaR6oo6JaFpF5Okdv4/P9eXXjPWUOlgyDfrPk8I6E1Qx4SZieN/ugYCWbdsf+ycZnp2ci8pQ+N/sv8Wg5+v9Te9Jls7ocDnZAgd44lJSbs5d7wv7KKVMIqbE4OlYUnZ1ShqCXDTpflnTLb55FOvVMoFoNOhE1wddCePT5wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://192.168.0.103:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://192.168.0.103:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
}
