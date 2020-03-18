define(function () {
    return {
        type: "line",
        height: 400,
        rows: [
            {
                view: 'button',
                label: 'Cars',
                click: function () {
                    routie('cars')
                }
            },
            {template: "row1"},
            {template: "row2"},
            {
                cols: [
                    {template: "col1"},
                    {template: "col2"}
                ]
            }
        ]
    }
});