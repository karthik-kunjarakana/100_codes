	AREA prog, code, readonly
	MOV R0,#5
	MOV R1,R0
UP	SUBS R1,#1
	MUL R2,R0,R1
	MOV R0,R2
	CMP R1,#1
	BNE UP
	LDR R3,=0x40000000
	STR R2,[R3]
STOP B STOP
	END