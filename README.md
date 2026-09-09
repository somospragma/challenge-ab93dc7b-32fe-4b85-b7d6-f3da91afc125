# Diseño y Evaluación de Arquitectura de Software

El sistema de banca en línea de Pragma necesita una nueva arquitectura para manejar un aumento en las transacciones diarias. El equipo de arquitectura ha decidido aplicar metodologías como ADD (Attribute Driven Design), DDD (Domain Driven Design) y métodos de evaluación como ATAM (Architecture Tradeoff Analysis Method) y SAAM (Software Architecture Analysis Method). Tu misión es diseñar la arquitectura, tomar decisiones críticas y acompañar su salida a producción.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Metodologías y frameworks para diseño y evaluación de arquitectura de software |
| **Nivel** | advanced-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 10-12 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del Sistema Existente

**Objetivo:** Identificar las restricciones y ambigüedades del sistema actual.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Analiza el sistema de banca en línea existente de Pragma.
- Identifica las restricciones técnicas y de negocio que afectan el diseño de la nueva arquitectura.
- Enumera las ambigüedades que podrían impactar las decisiones de diseño.

**Entregable:** Documento de exploración con restricciones y ambigüedades identificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo las restricciones técnicas influyen en las decisiones de arquitectura.
- Piensa en cómo las ambigüedades podrían ser resueltas o aclaradas.

</details>

### Fase 2: Diseño de la Nueva Arquitectura

**Objetivo:** Aplicar metodologías como ADD y DDD para diseñar la nueva arquitectura.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Usa ADD para definir los atributos clave del sistema.
- Aplica DDD para modelar el dominio y sus relaciones.
- Diseña la arquitectura considerando las restricciones y ambigüedades identificadas en la fase anterior.

**Entregable:** Documento de diseño de la nueva arquitectura con diagramas y descripciones.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que ADD se enfoca en atributos como rendimiento, seguridad y escalabilidad.
- DDD te ayuda a modelar el dominio de manera efectiva.

</details>

### Fase 3: Evaluación de la Arquitectura

**Objetivo:** Aplicar métodos de evaluación como ATAM y SAAM para validar la arquitectura.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Usa ATAM para analizar los trade-offs de la arquitectura.
- Aplica SAAM para evaluar la calidad y robustez de la arquitectura.
- Documenta las fortalezas y debilidades identificadas.

**Entregable:** Documento de evaluación con fortalezas, debilidades y recomendaciones.

<details>
<summary>Pistas de conocimiento</summary>

- ATAM te ayudará a identificar los trade-offs clave.
- SAAM es útil para evaluar la calidad y robustez de la arquitectura.

</details>

### Fase 4: Acompañamiento a Producción

**Objetivo:** Acompañar la salida de la arquitectura a producción.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Crea un plan de transición para llevar la nueva arquitectura a producción.
- Identifica los riesgos y mitigaciones necesarios.
- Acompaña el despliegue y monitorea el rendimiento.

**Entregable:** Plan de transición y reporte de monitoreo.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los pasos necesarios para una transición suave.
- Piensa en cómo mitigar los riesgos identificados.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es ADD y cómo se usa en el diseño de arquitectura?
- **paraQueSirve**: ¿Para qué sirve DDD en el modelado del dominio?
- **comoSeUsa**: ¿Cómo se usa ATAM para evaluar trade-offs en la arquitectura?
- **erroresComunes**: ¿Cuáles son errores comunes al aplicar SAAM?
- **queDecisionesImplica**: ¿Qué decisiones implica el acompañamiento de la arquitectura a producción?

## Criterios de Evaluacion

- Identificar restricciones y ambigüedades del sistema existente.
- Aplicar ADD y DDD para diseñar la nueva arquitectura.
- Evaluar la arquitectura usando ATAM y SAAM.
- Acompañar la salida de la arquitectura a producción.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
