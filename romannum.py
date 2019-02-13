class py_sol:
    def roman_to_int(self, s):
        rom_val = {'I': 1, 'V': 5, 'X': 10}
        int_val = 0
        for r in range(len(s)):
            if r > 0 and rom_val[s[r]] > rom_val[s[r - 1]]:
                int_val += rom_val[s[r]] - 2 * rom_val[s[r - 1]]
            else:
                int_val += rom_val[s[r]]
        return int_val

print(py_sol().roman_to_int('XVII'))
