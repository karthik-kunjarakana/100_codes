	AREA prog,code,readonly
	MOV R2,#10
	MOV R3,#0
	MOV R4,#0
	LDR R1,=NUM
UP	LDR R0,[R1],#4
	MOVS R0,R0,LSR #1
	ADDCS R4,R4,#1
	ADDCC R3, R3, #1
	SUBS R2,#1
	BNE UP
	LDR R5,=0X40000000
	STRB R4,[R5],#1
	STRB R3,[R5]
STOP B STOP
	AREA NUMBERS, DATA,READONLY
NUM DCD 1,2,3,4,5,6,7,8,9,10
	END