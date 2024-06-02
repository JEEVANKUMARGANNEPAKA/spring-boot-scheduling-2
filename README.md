Understanding Cron Expressions

Cron expressions are used to define the schedule in a detailed manner. They consist of six or seven fields:

    Seconds (0–59)
    Minutes (0–59)
    Hours (0–23)
    Day of month (1–31)
    Month (1–12 or JAN–DEC)
    Day of week (0–6 or SUN–SAT)
    Year (optional)

Each field can contain specific values, ranges, lists, or special characters. Here are some examples:

    0 0 12 * * ? - At 12:00 PM (noon) every day
    0 0/5 * * * ? - Every 5 minutes
    0 0 0 1 1 ? - At midnight on January 1st every year
    0 0 8-10 * * ? - Every hour from 8 AM to 10 AM every day
    0 0 9-17 * * MON-FRI - At 9 AM to 5 PM on weekdays
    0 0 0 L * ? - At midnight on the last day of the month

Special Characters in Cron Expressions

    * - Represents all possible values
    ? - No specific value (used in the day of month and day of week fields)
    - - Specifies a range of values
    , - Specifies a list of values
    / - Specifies increments (e.g., 0/5 means every 5 seconds/minutes)
    L - Last day of the month or week
    W - Nearest weekday to the given day of the month
    # - Specifies "nth" day of the month (e.g., 2#1 means the first Monday of the month)
