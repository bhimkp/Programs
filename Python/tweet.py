from collections import Counter
t_cases = int(input())
t_count = 0
t_names = []
while t_count < t_cases:
	num = int(input())
	count = 0
	while count < num:
		name = str(input())
		t_names.append(name)
		count += 1
	t_count += 1
uniq_names = [pref_names.split()[0] for pref_names in t_names]
times = Counter(uniq_names)
repeat = times.values()
for element in set(repeat):
	dupl = ([(key, value) for key, value in sorted(times.items()) if value == element])
	if len(dupl) > 1:
		for (key, value) in dupl:
			print (key,'',value)
	max_value = max(times.values())
	temp_max_result = [(key, value) for key, value in sorted(times.items()) if value == max_value]
	if temp_max_result != dupl:
		for (key,value) in temp_max_result:
			print (key,'',value)