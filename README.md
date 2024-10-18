# Exercício 01 - Arquitetura de Software PPCA

<img src="./prints/diagrama.png" align="center">

## Aluno: Henrick de Sousa Nogueira

## End-points

### /traffic-control/heavy

#### PUT
##### Summary:

Recursos para modificar o estado para HEAVY

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Trânsito intenso, veículos se movendo lentamente. |

### /traffic-control/free

#### PUT
##### Summary:

Recursos para modificar o estado para FREE

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Trânsito fluindo livremente. |

### /traffic-control/congested

#### PUT
##### Summary:

Recursos para modificar o estado para CONGESTED

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Trânsito congestionado, quase parado. |

### /traffic-control/closed

#### PUT
##### Summary:

Recursos para modificar o estado para CLOSED

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Estrada fechada para veículos. |

### /traffic-control/change-state

#### POST
##### Summary:

Recursos para modificar o estado baseado no parâmetro

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| state | query |  | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | O estado do tráfego foi alterado para: ... |

### /traffic-control/current-state

#### GET
##### Summary:

Recursos para checar estado atual de tráfego

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | O estado do tráfego foi alterado para: ... |
