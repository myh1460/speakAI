


​          
# SpeakAI 智能语音助手

## 🎯 项目简介

SpeakAI 是一个基于人工智能的英语口语练习项目，包含英语跟读，场景对话，角色对话，错词学习等功能。

## 🏗️ 系统架构

### 技术栈
- **前端**: uni-app (Vue3 )
- **后端**: Java ,Spring Boot，sa-token,mybatis-plus,kafka,Elasticsearch
- **大模型**: Python (TTS, whisper)，Java(Llama)
- **数据库**: MySQL 

### 项目结构
```
speakai-uniapp/
├── speakai-uniapp/          # uni-app前端项目
│   ├── src/
│   │   ├── pages/          # 页面组件
│   │   ├── components/     # 公共组件
│   │   ├── utils/          # 工具函数
│   │   └── static/         # 静态资源
├── speakai-java/           # Java后端服务
│   ├── src/main/java/      # 主代码
│   └── src/test/java/      # 测试代码
├── Pythonprojects/         # Python语音处理
│   ├── src/
│   │   ├── TTS.py         # 文本转语音
│   │   ├── app.py         # Flask API服务
│   │
└── README.md
```

## 🚀 快速开始

### 环境要求
- Node.js ≥ 16.0.0
- Java ≥ 8
- Python ≥ 3.8
- MySQL ≥ 5.7

### 前端启动
```bash
# 进入前端目录
cd speakai-uniapp
# 安装依赖
npm install
# 开发环境运行
npm run dev:h5        # H5端
# 构建生产版本
npm run build:h5
```

### 后端启动
```bash
# 进入后端目录
cd speakai-java

# 安装依赖并运行
mvn clean install
mvn spring-boot:run
```

### 核心功能
- **语音识别**: 支持英文语音识别，准确率高达95%
- **场景对话及角色对话**：对不同的角色及场景采用不同的大模型
- **错题本**:记录用户在英语跟读中的错词
- **英语口语打分**：支持对用户的英语语音进行打分
- **智能对话**: 基于大语言模型的自然语言理解
- **语音合成**: 支持多种音色调节
- **用户管理**: 完整的用户注册、登录

## 🔧 配置说明

### 环境变量配置
在 `speakai-uniapp/.env` 文件中配置：
```bash
# API基础地址
VITE_API_BASE_URL=http://localhost:8080/api

# 语音识别服务地址
VITE_ASR_SERVICE_URL=http://localhost:5000

# 微信配置
VITE_WECHAT_APP_ID=your_wechat_app_id
```

### 数据库配置
在 `speakai-java/src/main/resources/application.yml` 中配置：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/speakai?useSSL=false&serverTimezone=UTC
    username: your_username
    password: your_password
```

## 📱 使用指南

### H5使用
1. 访问 `http://localhost:5173`
2. 允许浏览器使用麦克风权限
3. 点击开始语音对话

## 🧪 开发规范

### 代码规范
- 前端遵循 [Vue.js 风格指南](https://cn.vuejs.org/v2/style-guide/)
- Java代码遵循 [阿里巴巴Java开发手册](https://github.com/alibaba/p3c)
- Python代码遵循 [PEP 8](https://pep8.org/)

## 📄 许可证

本项目采用 Apache-2.0 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 👥 联系方式

- **项目主页**: [https://github.com/myh1460/speakAI](https://github.com/myh1460/speakAI)
- **问题反馈**: [Issues](https://github.com/your-username/speakai/issues)
- **邮箱**: 1460458575@qq.com

## 🙏 致谢

- 感谢 [uni-app](https://uniapp.dcloud.io/) 提供的跨端开发框架
- 感谢所有贡献者和使用者的支持

---

**⭐ 如果这个项目对您有帮助，请给个Star支持一下！**
        