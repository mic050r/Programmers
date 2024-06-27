SELECT  NAME
FROM    ANIMAL_INS
WHERE   DATETIME = (
            --가장 먼저 들어온 => DATETIME의 최솟값
            SELECT  MIN(DATETIME)
            FROM    ANIMAL_INS
        )