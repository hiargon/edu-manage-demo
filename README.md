# 使用说明

## 查询学生信息

```
# 接口路径：/stu/list
# 接口入参：无
```

## 新增学生信息

```
# 接口路径：/stu/add
# 接口入参：
{
    "name": "Jack",
    "sex": 0,
    "age": 24,
    "grade": 3,
    "classroom": "9-208",
    "headTeacher": "Alice",
    "height": 188.00,
    "weight": 90.00,
    "startDate": "2023-09-01 10:00:00"
}
```

## 更新学生信息

```
# 接口路径：/stu/modify
# 接口入参：
{
    "id": "634bc49c-9386-4ce5-87ce-07564dbc9444",
    "name": "Jack",
    "sex": 0,
    "age": 29,
    "grade": 3,
    "classroom": "555",
    "headTeacher": "Alice2",
    "height": 188.00,
    "weight": 90.777,
    "startDate": "2024-09-01 10:00:00"
}
```

## 删除学生信息

```
# 接口路径：/stu/delete
# 接口入参：
{
    "id": "634bc49c-9386-4ce5-87ce-07564dbc9444"
}
```

