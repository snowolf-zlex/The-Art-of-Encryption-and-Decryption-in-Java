# 《Java加密与解密的艺术》源代码

<img
  src="《Java加密与解密的艺术》（第1版）.jpg" 
  alt="《Java加密与解密的艺术》（第1版）" height="600" width="450"/>
<img
  src="《Java加密与解密的艺术》（第2版）.jpg" 
  alt="《Java加密与解密的艺术》（第2版）" height="600" width="450"/>

主要介绍基于Java语言的加密与解密相关源码，包括Java原生、[Bouncy Castle](https://www.bouncycastle.org/ "BouncyCastle")和[Commons Codec](https://commons.apache.org/proper/commons-codec/ "Commons Codec")的代码实现及测试用例。

- [《Java加密与解密的艺术》源代码](#java加密与解密的艺术源代码)
  - [文本编码协议(TXP)](#文本编码协议txp)
  - [数字摘要算法(HF)](#数字摘要算法hf)
    - [MD系列算法](#md系列算法)
    - [SHA系列算法](#sha系列算法)
    - [MAC系列算法](#mac系列算法)
    - [RipeMD系列算法和HmacRipeMD系列算法](#ripemd系列算法和hmacripemd系列算法)
  - [对称加密算法(SE)](#对称加密算法se)
    - [DES算法](#des算法)
    - [DESede算法](#desede算法)
    - [AES算法](#aes算法)
    - [IDEA算法](#idea算法)
    - [PBE算法](#pbe算法)
  - [非对称加密算法(AE)](#非对称加密算法ae)
    - [DH算法](#dh算法)
    - [RSA算法](#rsa算法)
    - [ElGamal算法](#elgamal算法)
  - [数字签名算法(DS)](#数字签名算法ds)
    - [DSA算法](#dsa算法)
    - [RSA数字签名算法](#rsa数字签名算法)
    - [ECDSA算法](#ecdsa算法)
  - [数字证书签发及认证(CA)](#数字证书签发及认证ca)
    - [PKCS常用标准](#pkcs常用标准)

### 文本编码协议(TXP)

**TXP**（Text Protocol），即文本协议，相关代码位于TXP目录内。  
这里主要是指Base64编码，共有2种实现方式，分别由Bouncy Castle和Commons Codec提供。
Base64并不是真正的密码学算法，但它对于我们理解算法实现，以及密文的文本化展示有重要的作用，所以这里也一并将它纳入本书介绍范围中。

### 数字摘要算法(HF)

**HF**(Hash Function)，即哈希算法函数，包括MD、MAC、SHA，以及RIPE等算法，相关代码位于HF目录内。
在Java原生算法的基础上，Bouncy Castle有更丰富的补充。如Java原生只提供了MD5算法实现，而Bouncy Castle补充了MD4等其他数字摘要算法实现。

#### MD系列算法

算法|摘要长度|备注
------ | ------ | ------
MD2|128|Java原生实现
MD5|128|Java原生实现
MD4|128|Bouncy Castle实现

#### SHA系列算法

算法|摘要长度|备注
------ | ------ | ------
SHA-1|160|Java原生实现
SHA-256|256|Java原生实现
SHA-384|384|Java原生实现
SHA-512|512|Java原生实现
SHA-224|224|Bouncy Castle实现

#### MAC系列算法

算法|摘要长度|备注
------ | ------ | ------
HmacMD5|128|Java原生实现
HmacSHA1|160|Java原生实现
HmacSHA256|256|Java原生实现
HmacSHA384|384|Java原生实现
HmacSHA512|512|Java原生实现
HmacMD2|128|Bouncy Castle实现
HmacMD4|128|Bouncy Castle实现
HmacSHA224|224|Bouncy Castle实现

#### RipeMD系列算法和HmacRipeMD系列算法

算法|摘要长度|备注
------ | ------ | ------
RipeMD128|128|Bouncy Castle实现
RipeMD160|160|Bouncy Castle实现
RipeMD256|256|Bouncy Castle实现
RipeMD320|320|Bouncy Castle实现
HmacRipeMD128|128|Bouncy Castle实现
HmacRipeMD160|160|Bouncy Castle实现

### 对称加密算法(SE)

**SE**（Symmetric Encryption），即对称加密算法，包括DES、AES等常见的密文传递算法，相关代码位于SE目录内。
对称加密算法的密钥长度和算法对于密文安全性有举足轻重的作用，Bouncy Castle提供了较Java原生更长的秘钥（256位），还提供了IDEA等算法实现。

#### DES算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
DES|56(56)|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|NoPadding，PKCS5Padding，ISO10126Padding|Java原生实现
DES|64(56)|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|PKCS7Padding，ISO10126d2Padding，X932Padding，ISO7816d4Padding，ZeroBytePadding|Bouncy Castle实现

#### DESede算法

算法|密钥长度(默认值)|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
DESede（Triple DES，3DES）|112(168)，168(168)|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|NoPadding，PKCS5Padding，ISO10126Padding|Java原生实现
DESede（Triple DES，3DES）|128(168)，192(168)|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|PKCS7Padding，ISO10126d2Padding，X932Padding，ISO7816d4Padding，ZeroBytePadding|Bouncy Castle实现

#### AES算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
AES|128（128），192（128），256（128）|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|NoPadding，PKCS5Padding，ISO10126Padding|Java原生实现 若使用256位密钥需要获得无政策限制权限文件（Unlimited Strength Jurisdiction Policy Files）
AES|128（128），192（128），256（128）|ECB，CBC，PCBC，CTR，CTS，CFB，CFB8至CFB128，OFB，OFB8至OFB128|PKCS7Padding，ZeroBytePadding|Bouncy Castle实现

#### IDEA算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
IDEA|128（128）|ECB|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现

#### PBE算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
PBEWithMD5AndDES|56（56）|CBC|PKCS5Padding|Java原生实现
PBEWithMD5AndTripleDES|112（168），168（168）|CBC|PKCS5Padding|Java原生实现
PBEWithSHA1AndDESede|112（168），168（168）|CBC|PKCS5Padding|Java原生实现	
PBEWithSHA1AndRC2_40|40 至 1024（8的倍数）（128）|CBC|PKCS5Padding|Java原生实现		
PBEWithMD5AndDES|64（64）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithMD5AndRC2|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHA1AndDES|64（64）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHA1AndRC2|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAndIDEA-CBC|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd2-KeyTripleDES-CBC|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd3-KeyTripleDES-CBC|192（192）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd128BitRC2-CBC|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd40BitRC2-CBC|40（40）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd128BitRC4|128（128）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAnd40BitRC4|40（40）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现
PBEWithSHAAndTwofish-CBC|256（256）|CBC|PKCS5Padding， PKCS7Padding，ISO10126Padding，ZeroBytePadding|Bouncy Castle实现

### 非对称加密算法(AE)

**AE**（Asymmetric Encryption），即非对称加密算法，包括最初密钥交换算法的原型——DH，以及大名鼎鼎的RSA算法，相关代码位于AE目录内。
非对称加密算法主要用于传递对称加密算法的秘钥，因此不适用于加密明文。这里除了DH和RSA算法外，还有Bouncy Castle提供的EIGamal算法实现。

#### DH算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
DH|512至1024位（密钥长度为64的倍数，范围在512到1024位之间）（1024）|无|无|Java原生实现

#### RSA算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
RSA|512至65536位（密钥长度必须是64的倍数）（1024）|ECB|NoPadding，PKCS1Padding，OAEPWITHMD5AndMGF1Padding，OAEPWITHSHA1AndMGF1Padding，OAEPWITHSHA256AndMGF1Padding，OAEPWITHSHA384AndMGF1Padding，OAEPWITHSHA512AndMGF1Padding|Java原生实现
RSA|512至65536位（密钥长度必须是64的倍数）（2048）|NONE|NoPadding，PKCS1Padding，OAEPWithMD5AndMGF1Padding，OAEPWithSHA1AndMGF1Padding，OAEPWithSHA224AndMGF1Padding，OAEPWithSHA256AndMGF1Padding，OAEPWithSHA384AndMGF1Padding，OAEPWithSHA512AndMGF1Padding，ISO9796-1Padding|Bouncy Castle实现

#### ElGamal算法

算法|密钥长度（默认值）|工作模式|填充方式|备注
------ | ------ | ------ | ------ | ------
ElGamal|160至16,384位（密钥长度必须是8的倍数）（1024）|ECB，NONE|NoPadding，PKCS1Padding，OAEPWithMD5AndMGF1Padding，OAEPWithSHA1AndMGF1Padding，OAEPWithSHA224AndMGF1Padding，OAEPWithSHA256AndMGF1Padding，OAEPWithSHA384AndMGF1Padding，OAEPWithSHA512AndMGF1Padding，ISO9796-1Padding|Bouncy Castle实现

### 数字签名算法(DS)

**DS**(Digital Signature)，即数字签名算法，包括DSA、ECDSA和RSA算法实现，相关代码位于DS目录内。    
Bouncy Castle扩展ECDSA算法实现，提供了丰富的多达7种的ECC签名算法实现。

#### DSA算法

算法|密钥长度（默认值）|签名长度|备注
------ | ------ | ------ | ------
SHA1withDSA|512至1024位（密钥长度必须是64的倍数）（1024）|－|Java原生实现
SHA224withDSA|512至1024位（密钥长度必须是64的倍数）（1024）|－|Bouncy Castle实现
SHA256withDSA|512至1024位（密钥长度必须是64的倍数）（1024）|－|Bouncy Castle实现
SHA384withDSA|512至1024位（密钥长度必须是64的倍数）（1024）|－|Bouncy Castle实现
SHA512withDSA|512至1024位（密钥长度必须是64的倍数）（1024）|－|Bouncy Castle实现

#### RSA数字签名算法

算法|密钥长度（默认值）|签名长度|备注
------ | ------ | ------ | ------
MD2withRSA|512至65536位（密钥长度必须是64的倍数）（1024）|与密钥长度相同|Java原生实现
MD5withRSA|512至65536位（密钥长度必须是64的倍数）（1024）|与密钥长度相同|Java原生实现
SHA1withRSA|512至65536位（密钥长度必须是64的倍数）（1024）|与密钥长度相同|Java原生实现
SHA224withRSA|512至65536位（密钥长度必须是64的倍数）（2048）|Bouncy Castle实现

#### ECDSA算法

算法|密钥长度（默认值）|签名长度|备注
------ | ------ | ------ | ------
NONEwithECDSA|-（-）|128|Bouncy Castle实现
RIPEMD160withECDSA|-（-）|160|Bouncy Castle实现
SHA1withECDSA|-（-）|160|Bouncy Castle实现
SHA224withECDSA|-（-）|224|Bouncy Castle实现
SHA256withECDSA|-（-）|256|Bouncy Castle实现
SHA384withECDSA|-（-）|384|Bouncy Castle实现
SHA512withECDSA|-（-）|512|Bouncy Castle实现

### 数字证书签发及认证(CA)

**CA**(Certificate Authority)，包括了秘钥管理、证书校验，以及HTTPS协议实现等，相关代码位于CA目录内。

#### PKCS常用标准

公钥加密标准|描述信息|文件名后缀
------ | ------ | ------
PKCS#7|密码消息语法标准|.p7b、.p7c、.spc
PKCS#10|证书请求语法标准|.p10、.csr
PKCS#12|个人信息交换语法标准|.p12、.pfx
